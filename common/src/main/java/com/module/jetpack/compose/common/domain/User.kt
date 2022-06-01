package com.module.jetpack.compose.common.domain

import java.util.Date

interface User {
    val id: Long
    val login: String
    val nodeId: String
    val avatarUrl: String
    val gravatarId: String
    val url: String
    val htmlUrl: String
    val followersUrl: String
    val followingUrl: String
    val gistsUrl: String
    val starredUrl: String
    val subscriptionsUrl: String
    val organizationsUrl: String
    val reposUrl: String
    val eventsUrl: String
    val receivedEventsUrl: String
    val type: String
    val siteAdmin: Boolean
    val score: Float
    val name: String
    val company: String
    val blog: String
    val location: String
    val email: String
    val hireable: String
    val bio: String
    val publicRepos: Int
    val publicGists: Int
    val followers: Int
    val following: Int
}