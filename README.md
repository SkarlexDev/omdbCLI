# omdbcli
This program will read json response about movies from  [OMDb API](https://www.omdbapi.com/) </br>
Run `java -jar omdbcli.jar -h` for more information </br>
Available commands: </br>


| Argument       | Alias           | Parameter  | Mandatory | Result | 
| :------------- |:-------------:| :-----:| :-----:| :-----:|
| `s`      | `search` | `"<title>"` | yes | List of movies title based |
| `t`      | `title`      |  `"<title>"` | yes | A movie with title |
| `y`      | `year`      |  `0-2022` | no | Search movie by year |
| `sort`      | N/A      |  `title`/`year` | no | Sort result(s) by title or year |
| `h`      | `help`      |  N/A | no | Show help information |
</br>

Results from `s` will be written to `movies.csv` </br>
Result from `t` will be written to `movie.csv` </br>

#### Note:
Use `s` or `t` on any request but not both
