-- Utilizado o nome DATA ao invés de IMPORT, pois dá menos problema

INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob White', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Bootcamp HTML', 'https://cdn.pixabay.com/photo/2018/04/18/09/57/icon-3329995_960_720.jpg','https://cdn.pixabay.com/photo/2017/09/07/16/16/keyboard-2725833_960_720.jpg');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-07-13T20:50:07Z', TIMESTAMP WITH TIME ZONE '2021-07-13T20:50:07Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-12-13T20:50:07Z', TIMESTAMP WITH TIME ZONE '2021-12-13T20:50:07Z', 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Exemplo de notificação', TIMESTAMP WITH TIME ZONE '2021-06-21T20:50:07Z', true, 'Exemplo de route', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Outro exemplo de notificação', TIMESTAMP WITH TIME ZONE '2021-05-21T20:50:07Z', true, 'Outro exemplo de route', 3);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Novo exemplo de notificação', TIMESTAMP WITH TIME ZONE '2021-04-21T20:50:07Z', true, 'Novo exemplo de route', 2);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Mais um exemplo de notificação', TIMESTAMP WITH TIME ZONE '2021-03-21T20:50:07Z', true, 'Mais um exemplo de route', 2);