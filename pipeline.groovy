node {
  stage 'Run JMeter Test'
  sh 'E:\Performance_Testing_Zone\apache-jmeter-3.0\bin\jmeter.sh -n -t E:\Performance_Testing_Zone\apache-jmeter-3.0\bin\templates\Testing_Journals_Performance_Script.jmx -Jusers=5 -l Testing_Journals_Performance_Script_CI1.jtl'
}