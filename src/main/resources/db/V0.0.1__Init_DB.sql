-- # Bước 1: Kiểm tra tồn tại database
SELECT 1 FROM pg_database WHERE datname = 'tour_n3';

-- # Bước 2: Tạo database (chạy ngoài khối DO):
CREATE DATABASE tour_n3
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'vi_VN.UTF8'
    LC_CTYPE = 'vi_VN.UTF8'
    LOCALE = 'vi_VN.UTF8'
    ICU_LOCALE = 'vi-VN'
    LOCALE_PROVIDER = 'icu'
    CONNECTION LIMIT = -1
    TEMPLATE = 'template0';
