plugins {
	kotlin("jvm") apply false
	kotlin("multiplatform") apply false
	kotlin("plugin.spring") apply false
	id("org.jetbrains.dokka") apply false
	id("org.jmailen.kotlinter") apply false
}

allprojects {
	version = "0.0.1"
}

subprojects {
	group = "edu.renatafraga"
}