fun main() {

    val name1= UserRole.ADMIN

    val name2 = UserRole.EDITOR

    val name3 = UserRole.VIEWER

    checkAccess(name1)
    checkAccess(name2)
    checkAccess(name3)

}


enum class UserRole(var accessLevel: Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)
}

fun checkAccess(user:UserRole) {
    if (user.accessLevel == 1)
        println("sufficient access")

    else if (user.accessLevel == 2)
        println("sufficient access")

    else
        println("not sufficient access")
}
