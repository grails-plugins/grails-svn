grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        build "org.tmatesoft.svnkit:svnkit:1.3.5"
        test "org.gmock:gmock:0.8.1", {
            export = false
        }
    }
}
