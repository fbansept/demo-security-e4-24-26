```toml
name = 'login'
method = 'POST'
url = 'http://localhost:8080/api/auth/login'
sortWeight = 2000000
id = 'f55ecaa0-8807-4467-a5d4-b6fe98259485'

[body]
type = 'JSON'
raw = '''
{
  "email" : "b@.com",
  "password" : "root"
}'''
```
