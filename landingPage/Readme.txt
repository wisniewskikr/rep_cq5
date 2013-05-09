Assembly profiles:
- assembly-content
- assembly-full
- assembly-live
- assembly-initial


Host profiles:
- local-author
- local-publish


mvn clean install cq:install -P assembly-full,local-author


mvn release:prepare -Dusername= -Dpassword=
mvn release:perform -Dusername= -Dpassword=