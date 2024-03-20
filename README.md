# Blog App Restful API

## Tính năng

### Xác thực người dùng (`AuthController`)

- Đăng nhập: Người dùng có thể đăng nhập bằng cách gửi một yêu cầu POST đến `/api/v1/auth/login` hoặc `/api/v1/auth/signin` với thông tin đăng nhập.
- Đăng ký: Người dùng mới có thể đăng ký bằng cách gửi một yêu cầu POST đến `/api/v1/auth/register` hoặc `/api/v1/auth/signup` với thông tin đăng ký.

### Quản lý bài viết (`PostController`)

- Xem tất cả bài viết: Người dùng có thể xem tất cả bài viết bằng cách gửi một yêu cầu GET đến `/api/v1/posts`.
- Xem bài viết theo ID: Người dùng có thể xem chi tiết một bài viết bằng cách gửi một yêu cầu GET đến `/api/v1/posts/{id}`.
- Tạo bài viết mới: Người dùng có thể tạo một bài viết mới bằng cách gửi một yêu cầu POST đến `/api/v1/posts`.
- Cập nhật bài viết: Người dùng có thể cập nhật một bài viết bằng cách gửi một yêu cầu PUT đến `/api/v1/posts/{id}`.
- Xóa bài viết: Người dùng có thể xóa một bài viết bằng cách gửi một yêu cầu DELETE đến `/api/v1/posts/{id}`.
- Xem bài viết theo danh mục: Người dùng có thể xem tất cả bài viết trong một danh mục bằng cách gửi một yêu cầu GET đến `/api/v1/posts/category/{id}`.

### Quản lý bình luận (`CommentController`)

- Tạo bình luận mới: Người dùng có thể tạo một bình luận mới bằng cách gửi một yêu cầu POST đến `/api/v1/comments`.
- Xem bình luận theo ID: Người dùng có thể xem chi tiết một bình luận bằng cách gửi một yêu cầu GET đến `/api/v1/comments/{id}`.
- Cập nhật bình luận: Người dùng có thể cập nhật một bình luận bằng cách gửi một yêu cầu PUT đến `/api/v1/comments/{id}`.
- Xóa bình luận: Người dùng có thể xóa một bình luận bằng cách gửi một yêu cầu DELETE đến `/api/v1/comments/{id}`.

### Quản lý danh mục (`CategoryController`)

- Xem tất cả danh mục: Người dùng có thể xem tất cả danh mục bằng cách gửi một yêu cầu GET đến `/api/v1/categories`.
- Xem danh mục theo ID: Người dùng có thể xem chi tiết một danh mục bằng cách gửi một yêu cầu GET đến `/api/v1/categories/{id}`.
- Tạo danh mục mới: Người dùng có thể tạo một danh mục mới bằng cách gửi một yêu cầu POST đến `/api/v1/categories`.
- Cập nhật danh mục: Người dùng có thể cập nhật một danh mục bằng cách gửi một yêu cầu PUT đến `/api/v1/categories/{id}`.
- Xóa danh mục: Người dùng có thể xóa một danh mục bằng cách gửi một yêu cầu DELETE đến `/api/v1/categories/{id}`.

## Cài đặt

Đảm bảo bạn đã cài đặt Java và Maven trên máy của bạn. Sau đó, bạn có thể clone dự án này và chạy lệnh sau để cài đặt các phụ thuộc:

```bash
mvn install
```

## Chạy dự án

Tham khảo file data.sql để biết thông tin về cách khởi tạo database.

Để chạy dự án, hãy sử dụng lệnh sau hoặc sử dụng IDE:

```bash
mvn spring-boot:run
```

## Tài liệu API

Tài liệu API có thể được truy cập tại [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) sau khi bạn đã chạy dự án.

## Test API với Postman

Dự án này đi kèm với một bộ sưu tập Postman, giúp bạn dễ dàng test các API. Bạn có thể sử dụng bộ sưu tập này từ `BlogRestAPI.postman_collection.json`.

Sau khi tải về, hãy mở Postman và chọn `File > Import...` để import bộ sưu tập vào Postman. Bạn có thể tham khảo [hướng dẫn này](https://learning.postman.com/docs/getting-started/importing-and-exporting-data/) để biết thêm chi tiết.

## Database mẫu

Dự án này cung cấp một database mẫu để bạn có thể bắt đầu nhanh chóng. Bạn có thể sử dụng database mẫu từ `data.sql`.

Để sử dụng database mẫu, hãy import nó vào hệ thống quản lý database của bạn. Bạn có thể tham khảo [hướng dẫn này](đường dẫn đến hướng dẫn import database) để biết cách import database.