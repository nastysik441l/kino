<?php
// Подключение к базе данных
$servername = "/localhost:3306";
$username = "root";
$password = "root";
$dbname = "spring_web_menu";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Получение данных POST
$data = json_decode(file_get_contents('php://input'), true);

$x = $data['x'];
$y = $data['y'];
$width = $data['width'];
$height = $data['height'];

// SQL-запрос для вставки данных
$sql = "INSERT INTO selected_seats (x, y, width, height) VALUES ('$x', '$y', '$width', '$height')";

$response = array();
if ($conn->query($sql) === TRUE) {
    $response['status'] = 'success';
} else {
    $response['status'] = 'error';
    $response['message'] = $conn->error;
}

$conn->close();

// Возвращение ответа в формате JSON
header('Content-Type: application/json');
echo json_encode($response);
?>
