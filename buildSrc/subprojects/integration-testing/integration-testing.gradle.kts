plugins {
    `java-gradle-plugin`
}

dependencies {
    api(project(":kotlinDsl"))
    implementation(project(":cleanup"))
    implementation(project(":configuration"))
    implementation(project(":versioning"))
    implementation(project(":build"))
    testCompile("junit:junit:4.12")
}

gradlePlugin {
    (plugins) {
        "crossVersionTests" {
            id = "gradlebuild.cross-version-tests"
            implementationClass = "org.gradle.gradlebuild.test.integrationtests.CrossVersionTestsPlugin"
        }
        "distributionTesting" {
            id = "gradlebuild.distribution-testing"
            implementationClass = "org.gradle.gradlebuild.test.integrationtests.DistributionTestingPlugin"
        }
        "integrationTests" {
            id = "gradlebuild.integration-tests"
            implementationClass = "org.gradle.gradlebuild.test.integrationtests.IntegrationTestsPlugin"
        }
        "testFixtures" {
            id = "gradlebuild.test-fixtures"
            implementationClass = "org.gradle.gradlebuild.test.fixtures.TestFixturesPlugin"
        }
    }
}