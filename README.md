# KillTheKing
A custom kill the king with events not finished.

Okey to not have errors in the project you need:
Lombok https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12 
Maven code:
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.12</version>
    <scope>provided</scope>
</dependency>
Spigot 1.7.10 https://getbukkit.org/get/jWPoIQARZsxCjUaqXgj2UwcQWqQdUYDo
<repositories>
    <!-- This adds the Spigot Maven repository to the build -->
    <repository>
        <id>spigot-repo</id>
        <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
    </repository>
</repositories>

<dependencies>
    <!--This adds the Spigot API artifact to the build -->
    <dependency>
           <groupId>org.spigotmc</groupId>
           <artifactId>spigot-api</artifactId>
           <version>1.7.10-R0.1-SNAPSHOT</version>
           <scope>provided</scope>
    </dependency>

    <!--This adds the Bukkit API artifact to the build -->
    <!-- Do not include this in the pom.xml file if the Spigot API is already added -->
    <dependency>
            <groupId>org.bukkit</groupId>
            <artifactId>bukkit</artifactId>
            <version>1.7.10-R0.1-SNAPSHOT</version>
            <scope>provided</scope>
    </dependency>
</dependencies>

