-- Table for storing students
CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    registration_id VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(255) NOT NULL
);

-- Table for storing subjects
CREATE TABLE IF NOT EXISTS subject (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Table for storing exams
CREATE TABLE IF NOT EXISTS exam (
    id INT AUTO_INCREMENT PRIMARY KEY,
    subject_id INT,
    FOREIGN KEY (subject_id) REFERENCES subject(id)
);
