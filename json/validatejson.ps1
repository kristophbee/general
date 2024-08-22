#load json
$json=Get-Content "data.json" | ConvertFrom-Json
Write-Output($json)
#convert to json again
$jsonobj = $json | ConvertTo-Json
#load schema
$schemaFile = (Get-ChildItem -Path "schema.json").FullName
#test json via schema
$result = $jsonobj | Test-Json -SchemaFile $schemaFile
if ($result){
    Write-Output("All good, a perfect match!")
} else {
    $result
}