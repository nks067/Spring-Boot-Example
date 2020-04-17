# Mongo GridFS
GridFS is a used for storing and fetching files that exceed the BSON-document size limit of 16 MB.

### GridFS stores files in two collections:

* <b>chunks stores</b> the binary chunks. 
* <b>files stores</b> the file’s metadata. 

```
db.fs.files.find()
db.fs.chunks.find({files_id:ObjectId('xxxxxxxxxxxxxxxxx')})
```
