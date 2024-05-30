<?php
session_start();

$response = array('authenticated' => false);

if (isset($_SESSION['user_id'])) {
    $response['authenticated'] = true;
}

echo json_encode($response);
?>
