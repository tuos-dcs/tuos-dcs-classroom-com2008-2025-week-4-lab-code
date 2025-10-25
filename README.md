# COM2008/3008 2025-26

## Code from end of Week 4 Lab

 - This project contains code from the end of week 3 lab.
 - If you are downloading this because you didn't get the work done by the end of week 4, please ensure that you go through the lab materials and that you understand how it has been made.

### Create a public/private key-pair

Not included in this repository is the key-pair required for JWT encoding/decoding, so you will have to recreate them as you did:

Open a mac/linux/WSL/Git Bash terminal and navigate (`cd` command) to the project directory and then to `src/main/resources` and enter the following commands

```bash
mkdir certs
cd certs
openssl genrsa -out keypair.pem 2048
openssl rsa -in keypair.pem -pubout -out public.pem
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem
rm keypair.pem
```

Now if you check the folder you are in (either with `ls`, `dir` or by looking in the folder browser in your IDE) you should see the generated key-pair `public.pem` and `private.pem`

Andy