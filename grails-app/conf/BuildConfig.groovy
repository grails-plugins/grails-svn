grails.project.work.dir = 'target'

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
        build("org.tmatesoft.svnkit:svnkit:1.3.5") {
            excludes "jna", "trilead-ssh2", "sqljet"
        }
        test("org.gmock:gmock:0.8.1") {
            export = false
        }
    }

    plugins {
        build(":release:1.0.0") {
            excludes "svn"
            export = false
        }
    }
}
