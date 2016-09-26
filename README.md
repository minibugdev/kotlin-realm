## Realm database on Kotlin Language
#### Error on build
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
#### Dependencies
- [Kotlin v1.0.4](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Relam v1.2.0](https://realm.io/docs/java/1.2.0/) (Also error on Realm v1.1.1)
