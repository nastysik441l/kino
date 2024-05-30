<?php
session_start();

// Проверяем, отправлены ли данные формы
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Подключаемся к базе данных и проверяем учетные данные пользователя
    $conn = new mysqli('localhost', 'username', 'password', 'database');

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $email = $_POST['email'];
    $password = $_POST['password'];

    $sql = "SELECT id, password FROM users WHERE email = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("s", $email);
    $stmt->execute();
    $stmt->bind_result($id, $hashed_password);
    $stmt->fetch();
    $stmt->close();
    $conn->close();

    if (password_verify($password, $hashed_password)) {
        $_SESSION['user_id'] = $id;
        header('Location: /');
        exit();
    } else {
        $error = "Неверный email или пароль.";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form method="POST" action="">
    <input type="email" name="email" placeholder="Email" required>
    <input type="password" name="password" placeholder="Password" required>
    <button type="submit">Login</button>
</form>
<?php if (isset($error)) echo "<p>$error</p>"; ?>
</body>
</html>
