INSERT INTO student (name, gpa) VALUES ('John Doe',3.4);
INSERT INTO student (name, gpa) VALUES ('Jane Smith',3.7);

INSERT INTO address ( city) VALUES ( 'Anytown');
INSERT INTO address ( city) VALUES ( 'Anytown');

INSERT INTO books (title, isbn)
VALUES
    ('Book 1', '123456789'),
    ('Book 2', '234567890'),
    ('Book 3', '345678901');

INSERT INTO authors (name)
VALUES
    ('Author 1'),
    ('Author 2'),
    ('Author 3');

INSERT INTO authors_books (books_id, authors_id)
VALUES
    (1, 1),
    (1, 2),
    (2, 2),
    (2, 3),
    (3, 3);



INSERT INTO course (name) VALUES ('Algorithm');
INSERT INTO course (name) VALUES ('Math 101');
INSERT INTO course (name) VALUES ('Science 101');

INSERT INTO subject (topic, course_id) VALUES ('Sorting', 1);
INSERT INTO subject (topic, course_id) VALUES ('Geometry', 1);
INSERT INTO subject (topic, course_id) VALUES ('Biology', 2);

INSERT INTO student_courses (student_id, course_id) VALUES (1, 1);
INSERT INTO student_courses (student_id, course_id) VALUES (1, 2);
INSERT INTO student_courses (student_id, course_id) VALUES (2, 2);


INSERT INTO course_details (description_id, name, program, course_id) VALUES (1, 'DBMS', 'MSC',1);
INSERT INTO course_details (description_id, name, program, course_id) VALUES (2, 'Fundamentals Geometry', 'BSC',2);
INSERT INTO course_details (description_id, name, program, course_id) VALUES (3, 'Fundamentals Bio', 'BSC',3)