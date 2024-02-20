package com.o7services.revisiontopics

import java.util.Calendar

/**
 * @Author: 017
 * @Date: 20/02/24
 * @Time: 12:06 pm
 */
data class MessageDataClass(
    var id: Int = 0,
    var message : String ?= null,
    var dateTime : Calendar = Calendar.getInstance()
)
