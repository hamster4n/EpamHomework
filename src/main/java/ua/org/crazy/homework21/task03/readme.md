Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для
указания зависимостей)

<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.4</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.powermock</groupId>
        <artifactId>powermock-reflect</artifactId>
        <version>3.2</version>
    </dependency>
    <dependency>
        <groupId>org.javassist</groupId>
        <artifactId>javassist</artifactId>
        <version>3.13.0-GA</version>
        <scope>compile</scope>
    </dependency>
</dependencies>

Реализуете парсер для этого формата данных, результатом его работы должен
быть список зависимостей для проекта (обратите свое внимание на то, что параметр
scope — не обязательный), т. е. такого