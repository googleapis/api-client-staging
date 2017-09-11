# -*- ruby -*-
# encoding: utf-8

Gem::Specification.new do |s|
  s.name          = 'googleapis-common-protos'
  s.version       = '1.3.5'

  s.authors       = ['Google Inc']
  s.description   = 'a grpc-based api'
  s.email         = 'googleapis-packages@google.com'
  s.files         = Dir.glob(File.join('lib', '**', '*.rb'))
  s.homepage      = 'https://github.com/googleapis/googleapis'
  s.license       = 'Apache-2.0'
  s.platform      = Gem::Platform::RUBY
  s.require_paths = ['lib']
  s.required_ruby_version = '>= 2.0.0'
  s.summary       = 'Common protobufs used in Google APIs'

  s.add_dependency 'google-protobuf', '~> 3.0'
  s.add_dependency 'grpc', '~> 1.0'

  s.add_development_dependency 'bundler', '~> 1.9'
  s.add_development_dependency 'rake', '~> 10.4'
end
