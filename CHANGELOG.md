# Changelog

## 3.19.3 (2026-04-03)

Full Changelog: [v3.18.0...v3.19.3](https://github.com/browserbase/stagehand-java/compare/v3.18.0...v3.19.3)

### Features

* Replace default model used in server-v3 api spec examples ([aec2bf3](https://github.com/browserbase/stagehand-java/commit/aec2bf3d0ab203f15e06940e174478bfa30bf70b))

## 3.18.0 (2026-03-25)

Full Changelog: [v0.7.1...v3.18.0](https://github.com/browserbase/stagehand-java/compare/v0.7.1...v3.18.0)

### Features

* [STG-1607] Yield finished SSE event instead of silently dropping it ([72fa653](https://github.com/browserbase/stagehand-java/commit/72fa6531d9996c0653fa610b5b05e8027c3a450b))
* Add explicit SSE event names for local v3 streaming ([6f7efad](https://github.com/browserbase/stagehand-java/commit/6f7efad3e19a4fdb911b2c478afb02ad2b63f8e9))
* Add missing cdpHeaders field to v3 server openapi spec ([5a9506d](https://github.com/browserbase/stagehand-java/commit/5a9506d5dfeb1ae172834941aad3bbd9e96f2973))
* Include LLM headers in ModelConfig ([dbf7424](https://github.com/browserbase/stagehand-java/commit/dbf74248557129e0e82067e7ce44bcbc4813174c))
* Revert broken finished SSE yield config ([f404196](https://github.com/browserbase/stagehand-java/commit/f4041968aefba0e64380ca1d14ff20e5f93f9494))
* variables for observe ([b10e2ad](https://github.com/browserbase/stagehand-java/commit/b10e2ad429ebac12464ac332eb32c2d11035c1ff))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([173adb9](https://github.com/browserbase/stagehand-java/commit/173adb9d14281cf3cb1eccedd850f5da1f95f41f))
* **client:** incorrect `Retry-After` parsing ([76ea3fc](https://github.com/browserbase/stagehand-java/commit/76ea3fc583bfe9ca7295856db85378b44d765b0f))


### Chores

* **ci:** skip lint on metadata-only changes ([db9534f](https://github.com/browserbase/stagehand-java/commit/db9534f195b6045ad9679b08243c36d55340569b))
* **ci:** skip uploading artifacts on stainless-internal branches ([4a1399c](https://github.com/browserbase/stagehand-java/commit/4a1399c7a535d9bf8934e9d142878e57a1537b8d))
* **internal:** bump ktfmt ([d6758da](https://github.com/browserbase/stagehand-java/commit/d6758da0fe85d048b4f8fcd740be7c37901bb253))
* **internal:** bump palantir-java-format ([3bf036a](https://github.com/browserbase/stagehand-java/commit/3bf036aed5ba8fb90fe4bf5bc6b62a49f09f7dcc))
* **internal:** codegen related update ([f94c8c9](https://github.com/browserbase/stagehand-java/commit/f94c8c9a86af4592fba5c42645ccc1099a8ab1fe))
* **internal:** tweak CI branches ([1d88e38](https://github.com/browserbase/stagehand-java/commit/1d88e3802216d33841d3595d3d9fa024189dfc28))
* **internal:** update gitignore ([690533c](https://github.com/browserbase/stagehand-java/commit/690533ceee3c5d482a17d67c36a7bceb62a63ec2))
* **internal:** update retry delay tests ([53bdc6b](https://github.com/browserbase/stagehand-java/commit/53bdc6ba4804aca38996fe28d5eeff412a10d189))

## 0.7.1 (2026-03-04)

Full Changelog: [v0.7.0...v0.7.1](https://github.com/browserbase/stagehand-java/compare/v0.7.0...v0.7.1)

### Documentation

* tweak README wording for release validation ([d60513d](https://github.com/browserbase/stagehand-java/commit/d60513dcbf3b65b64f2e8e86ef965927df74d40d))

## 0.7.0 (2026-02-25)

Full Changelog: [v0.6.1...v0.7.0](https://github.com/browserbase/stagehand-java/compare/v0.6.1...v0.7.0)

### Features

* [docsrevert spec gen changes ([a617093](https://github.com/browserbase/stagehand-java/commit/a617093b37a616450166c85400b5ee21e68161b8))
* [feat]: add support for local caching of agent when using api (2) ([3d9f1bb](https://github.com/browserbase/stagehand-java/commit/3d9f1bb130e77142e24dd4d0c7426a87df65e21a))
* add auto-bedrock support based on bedrock/provider.model-name ([d2ae617](https://github.com/browserbase/stagehand-java/commit/d2ae6176a35c30107c3eac7dfe6e73a1e11a1684))
* Add bedrock to provider enum in Zod schemas and OpenAPI spec ([6094f1e](https://github.com/browserbase/stagehand-java/commit/6094f1e40953452c5bd2c605f26e9a0eb6ffe596))
* Add executionModel serialization to api client ([2628417](https://github.com/browserbase/stagehand-java/commit/2628417132606dab5289282976ba4e9ef25b829d))
* add v3 integration tests matching cloud exactly ([769ed85](https://github.com/browserbase/stagehand-java/commit/769ed852faede431af5cef830df999d8eeaa24fa))
* **api:** manual updates ([007f9c7](https://github.com/browserbase/stagehand-java/commit/007f9c77a3ead3279c2a2432cbcd4c9cd365b386))
* **api:** manual updates ([cb5323a](https://github.com/browserbase/stagehand-java/commit/cb5323a5034a25ed82b7a09eb010542d5bad9d9c))
* **api:** manual updates ([ede49b6](https://github.com/browserbase/stagehand-java/commit/ede49b6c8137a59bcbfc1d2cc82a0fdda805ea11))
* **client:** add connection pooling option ([43e1dd6](https://github.com/browserbase/stagehand-java/commit/43e1dd65672f2f732fe2125b08964f9409ae20dc))
* **client:** send `X-Stainless-Kotlin-Version` header ([988e6c8](https://github.com/browserbase/stagehand-java/commit/988e6c8dc90bab42c243684a1d3a57e33a393861))
* End endpoint cleanup ([10ccbd9](https://github.com/browserbase/stagehand-java/commit/10ccbd915a545b6c35c95adada8c834808a35b88))
* Include replay endpoint in stainless spec so SDK clients can get run metrics ([e307cff](https://github.com/browserbase/stagehand-java/commit/e307cff5f7c2d63ca4b84f40d4656e5690dda7e3))
* move Stainless compatibility transforms from gen-openapi.ts into stainless.yml ([57d6b94](https://github.com/browserbase/stagehand-java/commit/57d6b94a1391ebd8b8023063f78d5b76bf91b65c))
* Multi-region stagehand api support ([58093e7](https://github.com/browserbase/stagehand-java/commit/58093e73be3d09204a92c3068425f278ecda5a71))
* randomize region used for evals, split out pnpm and turbo cache, veri… ([10ef9a5](https://github.com/browserbase/stagehand-java/commit/10ef9a5b77b7c5652ee50708097158c699571ba2))
* Removed MCP from readme for now ([2b8ab62](https://github.com/browserbase/stagehand-java/commit/2b8ab629120e0733755b598d0050e6c5af1a47b9))
* Update stainless.yml for project and publish settings ([65820a9](https://github.com/browserbase/stagehand-java/commit/65820a92b5569954133f10962c38ac85015aeda2))
* x-stainless-any fix, optional frame id, ModelConfigString fix ([ec581cf](https://github.com/browserbase/stagehand-java/commit/ec581cf6dcb166547521e8e64b1239876fd5a527))


### Bug Fixes

* **client:** disallow coercion from float to int ([012dbc8](https://github.com/browserbase/stagehand-java/commit/012dbc823262bf9707c4bac7ec161c79a0592e97))
* **client:** fully respect max retries ([f8b09f0](https://github.com/browserbase/stagehand-java/commit/f8b09f098ce22d6e8dce3f46ff67cc199f3e10ab))
* **client:** preserve time zone in lenient date-time parsing ([934b350](https://github.com/browserbase/stagehand-java/commit/934b350a93f668b988d465580a3f5cc0d1be8d37))
* **client:** send retry count header for max retries 0 ([f8b09f0](https://github.com/browserbase/stagehand-java/commit/f8b09f098ce22d6e8dce3f46ff67cc199f3e10ab))
* date time deserialization leniency ([63d6c36](https://github.com/browserbase/stagehand-java/commit/63d6c361ba8510cedd21bbf355881dd603ff06f1))
* **docs:** fix mcp installation instructions for remote servers ([793e911](https://github.com/browserbase/stagehand-java/commit/793e911f5e1bd911a5c92de375c3a158b94da45b))
* set Accept header in more places ([93c8fb8](https://github.com/browserbase/stagehand-java/commit/93c8fb892a58414bf1abc44536ce32b0a38e3386))


### Chores

* **ci:** upgrade `actions/github-script` ([4aa63b9](https://github.com/browserbase/stagehand-java/commit/4aa63b9de7d588e226a6b8de221daf152a4978dc))
* **ci:** upgrade `actions/setup-java` ([8b3f116](https://github.com/browserbase/stagehand-java/commit/8b3f116aff59f0a870c8bb55410fcd37c122b708))
* drop apache dependency ([6c15fb1](https://github.com/browserbase/stagehand-java/commit/6c15fb100b3b5b534cf3828e0505d61d39acff6f))
* **internal:** allow passing args to `./scripts/test` ([f771390](https://github.com/browserbase/stagehand-java/commit/f771390dc0796c154ad877c07d4e488192f40bc1))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([2918f13](https://github.com/browserbase/stagehand-java/commit/2918f1366c3193d21548dec899d3ae053dbd350a))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([b407a38](https://github.com/browserbase/stagehand-java/commit/b407a387d4131ab1a3e335dea7ed40501d327605))
* **internal:** depend on packages directly in example ([f8b09f0](https://github.com/browserbase/stagehand-java/commit/f8b09f098ce22d6e8dce3f46ff67cc199f3e10ab))
* **internal:** expand imports ([5fdbce4](https://github.com/browserbase/stagehand-java/commit/5fdbce4f7cfaa4cad320509daf7127e28c903db0))
* **internal:** improve maven repo docs ([0723676](https://github.com/browserbase/stagehand-java/commit/07236764dcf17210682b14d2f30b41b87a35061c))
* **internal:** make `OkHttp` constructor internal ([a90a520](https://github.com/browserbase/stagehand-java/commit/a90a520e7c24fb74bfdfe745c838c7ed100a7fed))
* **internal:** remove mock server code ([894267f](https://github.com/browserbase/stagehand-java/commit/894267f3648ee302413ff4238eec6e377c49133b))
* **internal:** update `actions/checkout` version ([77009b1](https://github.com/browserbase/stagehand-java/commit/77009b1b8512e7eb8f194fbc11564958d92f3028))
* **internal:** update `TestServerExtension` comment ([a422294](https://github.com/browserbase/stagehand-java/commit/a422294e50e1af7dfad542cab6e611dd8bc5cd84))
* **internal:** update maven repo doc to include authentication ([2dead90](https://github.com/browserbase/stagehand-java/commit/2dead900d2bf803af18b39d4754e29db132d3849))
* **internal:** upgrade AssertJ ([2a37357](https://github.com/browserbase/stagehand-java/commit/2a373577d46598634b9c31b0242fd55609371e9d))
* make `Properties` more resilient to `null` ([bccf234](https://github.com/browserbase/stagehand-java/commit/bccf23474d0e4ea75239f803650717d29e5b5f24))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/browserbase/stagehand-java/issues/3240) in tests ([63d6c36](https://github.com/browserbase/stagehand-java/commit/63d6c361ba8510cedd21bbf355881dd603ff06f1))
* update mock server docs ([971d983](https://github.com/browserbase/stagehand-java/commit/971d9833199160486a9d0e5b786c0537a0fbe6f0))


### Documentation

* add comment for arbitrary value fields ([6fa48db](https://github.com/browserbase/stagehand-java/commit/6fa48db3f27bcdc1e2a8255364f205f3823a03c9))

## 0.6.1 (2026-01-13)

Full Changelog: [v0.6.0...v0.6.1](https://github.com/browserbase/stagehand-java/compare/v0.6.0...v0.6.1)

## 0.6.0 (2026-01-13)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/browserbase/stagehand-java/compare/v0.5.0...v0.6.0)

### Features

* **client:** allow configuring dispatcher executor service ([b67a0d6](https://github.com/browserbase/stagehand-java/commit/b67a0d62fe7f2e15a73bc033c0a421daf88e6915))
* Removed requiring x-language and x-sdk-version from openapi spec ([2690cf4](https://github.com/browserbase/stagehand-java/commit/2690cf4d826f3a356f6049a5640fd15bf6e962ee))
* Using provider/model syntax in modelName examples within openapi spec ([aae3dce](https://github.com/browserbase/stagehand-java/commit/aae3dce8134b19c0bb3d24b848a73dd8a523aaec))


### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([32f6329](https://github.com/browserbase/stagehand-java/commit/32f6329e2ec8e30b1b2f701e9ed2f039e934fd49))

## 0.5.0 (2026-01-07)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/browserbase/stagehand-java/compare/v0.4.0...v0.5.0)

### Features

* /end endpoint returns empty object ([058cf38](https://github.com/browserbase/stagehand-java/commit/058cf3853b589356fe0b88d5899c98e4c44c8f19))
* Added optional param to force empty object ([a93f1bf](https://github.com/browserbase/stagehand-java/commit/a93f1bf0324f4fa0b1bd96122d29534ff03cd9b2))
* **client:** add `HttpRequest#url()` method ([5a4d99f](https://github.com/browserbase/stagehand-java/commit/5a4d99fd20473dcd6045fb65d8230c3894734364))


### Documentation

* add full working example script to readme and stagehand-java-example ([#5](https://github.com/browserbase/stagehand-java/issues/5)) ([7135947](https://github.com/browserbase/stagehand-java/commit/713594728cd301df4587bdb0337a5047695704eb))
* prominently feature MCP server setup in root SDK readmes ([0c7cb02](https://github.com/browserbase/stagehand-java/commit/0c7cb0241f65547071fcd15e7bce41f621cfbfcb))

## 0.4.0 (2026-01-05)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/browserbase/stagehand-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** manual updates ([5cf0d46](https://github.com/browserbase/stagehand-java/commit/5cf0d4684d652046dbf0c05e12a796423f860bd9))

## 0.3.0 (2025-12-23)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/browserbase/stagehand-java/compare/v0.2.0...v0.3.0)

### Features

* [STG-1053] [server] Use fastify-zod-openapi + zod v4 for openapi generation ([9de17a2](https://github.com/browserbase/stagehand-java/commit/9de17a2552f759f6e8f37de4c3b9bb5d403edcc4))
* **api:** manual updates ([d9e462c](https://github.com/browserbase/stagehand-java/commit/d9e462c24ed6d3e165a5873e7f70f011d768500a))
* **api:** manual updates ([b6bdf1a](https://github.com/browserbase/stagehand-java/commit/b6bdf1a26a45556dcfee59b088983cd7e7839f43))
* **api:** manual updates ([9b6860a](https://github.com/browserbase/stagehand-java/commit/9b6860a4f60d1a740fbb026eef291e40fb8e1845))
* **api:** manual updates ([28f7978](https://github.com/browserbase/stagehand-java/commit/28f7978e1f040169dbb20aa68efb8e5ceb9a34d2))
* **api:** manual updates ([07db616](https://github.com/browserbase/stagehand-java/commit/07db616b7209716efa346035d65f5d7bf616c992))
* **api:** manual updates ([3cf2073](https://github.com/browserbase/stagehand-java/commit/3cf20739785134610aa7bcbdbce3215c3c3a9970))
* **api:** manual updates ([adace53](https://github.com/browserbase/stagehand-java/commit/adace53fc3e4a0fb4b866172aec98519ec0f29d5))
* **api:** manual updates ([dd65420](https://github.com/browserbase/stagehand-java/commit/dd65420fecb521fba36cbf2a623ce675973a27a0))
* **api:** manual updates ([067c9e6](https://github.com/browserbase/stagehand-java/commit/067c9e644940fa3671665a902bc605b8e358473f))
* **api:** manual updates ([d7aabe3](https://github.com/browserbase/stagehand-java/commit/d7aabe36f42d8344477f2f468bd3ba15837c0516))
* **api:** manual updates ([13074f1](https://github.com/browserbase/stagehand-java/commit/13074f11bbc12057b60e89f37f850ca8f5bc7a83))


### Documentation

* add more examples ([54eba34](https://github.com/browserbase/stagehand-java/commit/54eba3455dbfc5dd61c1c3b88aedd34c56bce37a))

## 0.2.0 (2025-12-16)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/browserbase/stagehand-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** manual updates ([a5a66d6](https://github.com/browserbase/stagehand-java/commit/a5a66d64628b1f18f987d1d2b96d529d4a623f27))
* **api:** manual updates ([2b8487b](https://github.com/browserbase/stagehand-java/commit/2b8487b08f12aca78e9b8e252779be34c06ffe11))

## 0.1.0 (2025-12-16)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/browserbase/stagehand-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([143d677](https://github.com/browserbase/stagehand-java/commit/143d677a548f9b67f6d1960588d3d79e9c7647fe))
* **api:** manual updates ([f2d0690](https://github.com/browserbase/stagehand-java/commit/f2d0690f93415cafad61334d8eeb8c90d9ae2e43))
* **api:** manual updates ([48825ea](https://github.com/browserbase/stagehand-java/commit/48825eac78b9dd280020359253465ec0ab9d7405))
* **api:** manual updates ([daa8c1c](https://github.com/browserbase/stagehand-java/commit/daa8c1cbe7c3e67400d8661cbd511f47b61de91f))
* **api:** manual updates ([5d55cd0](https://github.com/browserbase/stagehand-java/commit/5d55cd0023694ed48862fa1737cce1cc67ec6a3f))
* **api:** manual updates ([2262f19](https://github.com/browserbase/stagehand-java/commit/2262f19462ce4e79f80df49c7652e3144c11c9c6))
* **api:** manual updates ([afa389f](https://github.com/browserbase/stagehand-java/commit/afa389f483845081daf43d102094e902c847efa5))
* **api:** manual updates ([5787da6](https://github.com/browserbase/stagehand-java/commit/5787da654a785904d9629e20baa9dc90739a35a5))
* **api:** manual updates ([40e95ed](https://github.com/browserbase/stagehand-java/commit/40e95ede73876583760706e7315f3621af2f8433))
* **api:** manual updates ([c6de1b7](https://github.com/browserbase/stagehand-java/commit/c6de1b76dc1deb1355c2e119740d4f494679e1ed))
* **api:** manual updates ([df9be74](https://github.com/browserbase/stagehand-java/commit/df9be74e9177579935e429d40c1c2574fd7f45e5))
* **api:** tweak branding and fix some config fields ([051317b](https://github.com/browserbase/stagehand-java/commit/051317bb6932ec86f0a990e181ffdce23c674785))


### Chores

* configure new SDK language ([7dcaca9](https://github.com/browserbase/stagehand-java/commit/7dcaca9445c9adcf6b88d7fc6393e974dae2b56e))
