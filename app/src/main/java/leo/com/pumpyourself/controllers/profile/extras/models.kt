package leo.com.pumpyourself.controllers.profile.extras

import java.io.Serializable

data class ItemFriend(
    val name: String,
    val status: String
) : Serializable

data class ItemGroup(
    val name: String,
    val description: String
) : Serializable

