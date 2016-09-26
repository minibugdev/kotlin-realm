## Realm database on Kotlin Language
### Dependencies
- [Kotlin v1.0.4](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Relam v1.0.1](https://realm.io/docs/java/1.0.1/)

### Warning !!
#### Error on build with Realm version 1.1.0 +
```Java
    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        .
        .
        .
        if (iterator.hasNext()) {
          throw getMissingProxyClassException(clazz); // get error at this line.
        }
    }
```

![Alt text](https://raw.githubusercontent.com/minibugdev/kotlin-relam/master/ss/error.png "Error")
