package com.github.vastemonde.scheduler.services

import com.intellij.openapi.project.Project
import com.github.vastemonde.scheduler.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
