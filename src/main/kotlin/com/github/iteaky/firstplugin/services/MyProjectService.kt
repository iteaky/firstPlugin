package com.github.iteaky.firstplugin.services

import com.github.iteaky.firstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
