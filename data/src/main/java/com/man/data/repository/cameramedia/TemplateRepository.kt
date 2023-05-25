package com.man.data.repository.cameramedia

import com.man.data.model.TemplateModel
import com.man.data.source.TemplateDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 *
 * Created by Lukmanul Hakim on  22/05/23
 * devs.lukman@gmail.com
 */

class TemplateRepository @Inject constructor() {
    fun getTemplates(): Flow<List<TemplateModel>> {
        return TemplateDataSource.fetchTemplates()
    }
}