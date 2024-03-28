-- Sample data for students
INSERT INTO student (registration_id, name) VALUES
('REG001', 'John Doe'),
('REG002', 'Jane Smith');

-- Sample data for subjects
INSERT INTO subject (name) VALUES
('Mathematics'),
('Physics');

-- Sample data for exams
INSERT INTO exam (subject_id) VALUES
(1), -- Mathematics exam
(2); -- Physics exam
