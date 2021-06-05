plugins {
    java
    jacoco
    pmd
    application
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testRuntimeOnly("org.junit.platform:junit-platform-console:1.2.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-params:5.6.2")
}

tasks {
    val flags =
            listOf("-Xlint:unchecked", "-Xlint:deprecation", "-Werror")

    getByName<JavaCompile>("compileJava") {
        options.compilerArgs = flags
    }

    getByName<JavaCompile>("compileTestJava") {
        options.compilerArgs = flags
    }
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}

sourceSets {
    main {
        java.srcDirs("Number/src")
    }
    test {
        java.srcDirs("Number/test")
    }
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform {}
}

pmd {
    ruleSets = listOf()
    ruleSetFiles = files("../conf/pmd/ruleset.xml")
    toolVersion = "6.27.0"
}

tasks.withType<JacocoReport> {
    afterEvaluate {
        classDirectories.setFrom(files(classDirectories.files.map {
            fileTree(it).apply {
                exclude("*/numberapp/*")
            }
        }))
    }
}

application{
    mainClassName = "number.numberapp.NumberApp"
    applicationDefaultJvmArgs+="--enable-preview"
}

defaultTasks("clean", "test", "jacocoTestReport", "pmdMain")