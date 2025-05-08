plugins {
    id("java")
}

group = "org.springframework"
version = "5.3.39-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
	optional("org.aspectj:aspectjweaver")
	optional(project(":spring-aop"))
	implementation(project(":spring-context"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}