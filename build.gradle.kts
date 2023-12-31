plugins {
	java
	id("org.springframework.boot") version "3.1.3"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {

//	implementation("org.springframework.boot:spring-boot-starter-graphql")
	implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    //implementation("org.mongodb:mongodb-driver-sync:4.10.2")
	implementation("org.springframework.data:spring-data-mongodb:4.1.3")
	implementation("org.mongodb:bson:4.10.2")


//	implementation("com.okta.spring:okta-spring-boot-starter:3.0.5")
	implementation("me.paulschwarz:spring-dotenv:4.0.0")
	compileOnly("org.projectlombok:lombok")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")


	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework:spring-webflux")
//	testImplementation("org.springframework.graphql:spring-graphql-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
