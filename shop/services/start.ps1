$serviceJars = Get-Childitem -Path $PSScriptRoot/**/target -Include *.jar -Recurse | % { $_.FullName }
foreach ($jarFile in $serviceJars) {
  echo "Starting JVM for $jarFile"
  Start-Process -FilePath 'java' -ArgumentList "-jar $jarFile"
}