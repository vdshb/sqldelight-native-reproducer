package com.example

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import co.touchlab.sqliter.DatabaseConfiguration

actual fun createDriver(filePath: String): SqlDriver {
    return NativeSqliteDriver(
        configuration = DatabaseConfiguration(
            name = filePath.substringAfterLast("/"),
            version = 0,
            create = { },
            upgrade = { _, _, _ -> },
            extendedConfig = DatabaseConfiguration.Extended(
                foreignKeyConstraints = false,
                basePath = filePath.substringBeforeLast("/")
            )
        )
    )
}
