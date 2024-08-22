#load json
$json=Get-Content ".\json\data.json" | ConvertFrom-Json
#convert to json again
$jsonobj = $json | ConvertTo-Json
#load schema
$schemaFile = (Get-ChildItem -Path ".\json\schema.json").FullName
#test json via schema
$result = $jsonobj | Test-Json -SchemaFile $schemaFile
$result
