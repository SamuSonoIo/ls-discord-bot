package com.learnspigot.bot.util

import dev.minn.jda.ktx.messages.Embed
import dev.minn.jda.ktx.messages.InlineEmbed
import net.dv8tion.jda.api.EmbedBuilder

fun embed(): EmbedBuilder {
    return EmbedBuilder().setColor(0x2B2D31)
}

fun InvisibleEmbed(builder: InlineEmbed.() -> Unit) = Embed {
    color = 0x2B2D31
    builder()
}