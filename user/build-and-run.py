#!/usr/bin/env python3

import os
import subprocess

def buildAndRun():
    try:
        print("Taking down containers...")
        subprocess.run(["docker-compose", "down"])
        print("Setting up containers...")
        subprocess.run(["docker-compose", "up", "--build", "-d"], check=True)
        print("Maven clean install...")
        subprocess.run(["mvn", "clean", "install"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Command failed with error: {e}")

if __name__ == "__main__":
    buildAndRun()