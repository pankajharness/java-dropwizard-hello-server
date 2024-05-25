workspace(name = "hello_world_server")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "rules_jvm_external",
    sha256 = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca",
    strip_prefix = "rules_jvm_external-4.2",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.2.zip",
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "io.dropwizard:dropwizard-core:2.0.26",
        "javax.servlet:javax.servlet-api:4.0.1",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)