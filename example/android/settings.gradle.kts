import java.util.Properties

include(":app")

val localPropertiesFile = File(rootProject.projectDir, "local.properties")
val properties = Properties()

if (!localPropertiesFile.exists()) {
    throw GradleException("local.properties file not found")
}

localPropertiesFile.inputStream().use { properties.load(it) }

val flutterSdkPath = properties.getProperty("flutter.sdk")
    ?: throw GradleException("flutter.sdk not set in local.properties")

apply(from = "$flutterSdkPath/packages/flutter_tools/gradle/app_plugin_loader.gradle") 