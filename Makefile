.PHONEY: build deploy-staging

build:
	docker build -t sleepyfox/clj-noob .

deploy-staging:
	docker push sleepyfox/clj-noob
