package com.example

import app.cash.sqldelight.db.SqlDriver

expect fun createDriver(filePath: String): SqlDriver
