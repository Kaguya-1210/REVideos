DROP DATABASE IF EXISTS REVideos;

CREATE DATABASE REVideos CHARSET=utf8;

USE REVideos;

CREATE TABLE user
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    username    VARCHAR(20) DEFAULT 'RE0',
    password    VARCHAR(40) NOT NULL,
    create_time DATETIME NOT NULL,
    update_time DATETIME,
    email VARCHAR(50) NOT NULL
);