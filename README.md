# Repo Meister NodeJS Yarn Example

This repository shows how the reusable GitHub Actions and Workflows for Continuous Integration are used.

**Repo Meister workflow:** [`main.yml`](.github/workflows/main.yml)

**Repo Meister action:** [`main-action.yml`](.github/workflows/main-action.yml)

## Running the example

The code in this repository is not important, but in case you want to run it, these are the steps:

1. Clone the repository

2. Install dependencies:

  ```shell
  yarn install
  ```

3. Optionally, run the unit-tests:

  ```shell
  yarn test
  ```

4. Run the application:

  ```shell
  yarn main
  ```