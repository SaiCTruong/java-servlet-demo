# Bước 1: Chọn một "image" Tomcat 10.1 (hỗ trợ Jakarta EE 10 của bạn)
FROM tomcat:10.1-jre17-slim

# Bước 2: Xóa các ứng dụng mặc định trong Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Bước 3: Sao chép tệp .war của bạn vào thư mục webapps của Tomcat
# Tệp .war này được lấy từ thư mục "target" sau khi bạn "Build" dự án
COPY target/Mail_week1-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war