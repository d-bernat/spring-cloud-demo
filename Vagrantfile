Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.synced_folder "/projects/spring-cloud-demo", "/spring-cloud-demo", create: true
#  config.vm.network "forwarded_port", guest: 8080, host: 18080
#  config.vm.network "forwarded_port", guest: 8761, host: 18761
#  config.vm.network "forwarded_port", guest: 8989, host: 18989
  config.vm.network "private_network", ip: "66.55.44.11"
  config.vm.provider "virtualbox" do |v|
    v.memory = 4096
    v.cpus = 2
  end
  
  config.vm.provision "docker" do |d|
    d.build_image "--tag=java /vagrant/docker-java"
  end    
  config.vm.provision "shell", inline: <<-EOC
    test -e /usr/local/bin/docker-compose || \\
    curl -sSL https://github.com/docker/compose/releases/download/1.5.1/docker-compose-`uname -s`-`uname -m` \\
      | sudo tee /usr/local/bin/docker-compose > /dev/null
    sudo chmod +x /usr/local/bin/docker-compose
    test -e /etc/bash_completion.d/docker-compose || \\
    curl -sSL https://raw.githubusercontent.com/docker/compose/$(docker-compose --version | awk 'NR==1{print $NF}')/contrib/completion/bash/docker-compose \\
      | sudo tee /etc/bash_completion.d/docker-compose > /dev/null 
    cd /spring-cloud-demo 
    docker-compose build > /dev/null 
    docker-compose up -d > /dev/null		
  EOC

end
