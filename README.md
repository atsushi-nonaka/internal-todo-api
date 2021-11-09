# todo-project
## APIs
### Create
```sh
curl -X POST -H "Content-Type: application/json" -d '{"id":"id1234", "title":"title", "content": "content", "start _date": "2021-01-01", "end_date": "2099-12-31", "due_date": "2099-12-31"}' localhost:8080/add_todo
```

### Read
```sh
curl localhost:8080/todos
```

### Update
```sh
curl -X PUT -H "Content-Type: application/json" -d '{"id":"id123456", "title":"TITLE", "content": "content", "start_date": "2021-01-01", "end_date": "2099-12-31", "due_date": "2099-12-31"}' localhost:8080/update_todo
```

### Delete
```sh
curl http://localhost:8080/delete_todo/${id} -XDELETE
``` 