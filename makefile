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

run-jar:
	java -jar target/web.jar