-- Step 1. 
CREATE DATABASE IF NOT EXISTS myblog;

-- Step 2. Run the server

--  Step 3. Use below commands:

USE myblog;

-- Insert into User table
INSERT INTO users (name, username, email, password) 
VALUES ('John Doe', 'johndoe', 'johndoe@example.com', '$2a$10$F36YNW8Xl96d95SL3fQ0FOxxgkJGM/9BzAxlYf71BKUanSopzN4wG');
-- password: 1234
INSERT INTO users (name, username, email, password) 
VALUES ('Monkey D. Luffy', 'luffy', 'luffy@example.com', '$2a$10$F36YNW8Xl96d95SL3fQ0FOxxgkJGM/9BzAxlYf71BKUanSopzN4wG');
-- password: 1234

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);

-- Insert into Category table
INSERT INTO categories (description, name) VALUES ('Some description', 'Technology');
INSERT INTO categories (description, name) VALUES ('Some description', 'Lifestyle');

-- Insert into Post table
INSERT INTO posts (title, content, description, category_id) VALUES ('First Post', 'This is the first post', 'Description', 1);
INSERT INTO posts ( title, content, description, category_id) VALUES ('Second Post', 'This is the second post', 'Description', 2);

-- Insert into Comment table (after above commands)
INSERT INTO comments (body, email,name, post_id) 
VALUES ('First comment',"user1@gmail.com","user1", 1);
INSERT INTO comments (body, email,name, post_id) 
VALUES ('Second comment',"user1@gmail.com","user1", 1);
INSERT INTO comments (body, email,name, post_id) 
VALUES ('Third comment',"user1@gmail.com","user1", 1);