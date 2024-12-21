install-maven:
	brew install maven
	@echo "Maven installed"
	@echo "Run 'mvn -v' to verify installation"
	mvn -v

# 清理maven, 删除target目录
mvn-clean:
	mvn clean

# 打包(檔名: <finalName>web</finalName>)
mvn-package:
	mvn clean package

# 示範怎麼吃到config(這樣給人家jar檔案就好)
run-jar:
	java -jar target/web.jar --spring.config.location=file:./src/main/resource/application.yml
