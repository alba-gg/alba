INSERT INTO category(`id`, `name`) VALUES (1, '요식업')
INSERT INTO category(`id`, `name`) VALUES (2, '엔터테인')
INSERT INTO category(`id`, `name`) VALUES (3, '스포츠')
INSERT INTO user (`id`, `user_id`, `password`, `email`, `name`, `age`, `gender`, `city`, `street`, `zip_code`) VALUES (1, 'testId', '1234', 'test@gmail.com', '김기동', 22, 'MAN', '서울', '성북구 장위로', '123456')
INSERT INTO subway_station(`id`, `name`, `line`) VALUES (1, '석계역', '1호선')
INSERT INTO subway_station(`id`, `name`, `line`) VALUES (2, '미아사거리역', '4호선')
INSERT INTO store (`id`, `name`, `city`, `street`, `zip_code`, `phone`, `category_id`, `president_id`, `subway_station_id`) VALUES (1, '김밥천국', '서울시', '강남구 역삼로 19길', '54321', '010-1234-1234', 1, 1, 1)
INSERT INTO store (`id`, `name`, `city`, `street`, `zip_code`, `phone`, `category_id`, `president_id`, `subway_station_id`) VALUES (2, '맥도날드', '서울시', '마포구 월드컵로 19길', '54321', '010-1234-1234', 1, 1, 2)
INSERT INTO store (`id`, `name`, `city`, `street`, `zip_code`, `phone`, `category_id`, `president_id`, `subway_station_id`) VALUES (3, '빕스', '서울시', '강북구 몰라로 19길', '54321', '010-1234-1234', 2, 1, 2)
INSERT INTO store (`id`, `name`, `city`, `street`, `zip_code`, `phone`, `category_id`, `president_id`, `subway_station_id`) VALUES (4, '이도곰탕', '서울시', '동대문구 동대문로 19길', '54321', '010-1234-1234', 2, 1, 2)
INSERT INTO store (`id`, `name`, `city`, `street`, `zip_code`, `phone`, `category_id`, `president_id`, `subway_station_id`) VALUES (5, '서브웨이', '서울시', '성동구 성수로 19길', '54321', '010-1234-1234', 3, 1, 1)
-- insert INTO store VALUES