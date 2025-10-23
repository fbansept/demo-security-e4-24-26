```toml
name = 'register'
method = 'POST'
url = 'http://localhost:8080/api/auth/register'
sortWeight = 1000000
id = '5203c7a4-bd27-459a-9926-b72d9c4d77bd'

[body]
type = 'JSON'
raw = '''
{
  "email" : "b@b.com",
  "password" : "root",
  "admin" : true
}'''
```
